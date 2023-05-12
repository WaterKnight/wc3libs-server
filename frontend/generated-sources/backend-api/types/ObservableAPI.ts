import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { CameraBounds } from '../models/CameraBounds';
import { Flags } from '../models/Flags';
import { Fog } from '../models/Fog';
import { Force } from '../models/Force';
import { ForceFlags } from '../models/ForceFlags';
import { ForcesChunk } from '../models/ForcesChunk';
import { GameVersion } from '../models/GameVersion';
import { GraphicsModes } from '../models/GraphicsModes';
import { Item } from '../models/Item';
import { ItemSet } from '../models/ItemSet';
import { LoadingScreen } from '../models/LoadingScreen';
import { Margins } from '../models/Margins';
import { Player } from '../models/Player';
import { PlayerBitmap } from '../models/PlayerBitmap';
import { PlayersChunk } from '../models/PlayersChunk';
import { Point2d } from '../models/Point2d';
import { PrologueScreen } from '../models/PrologueScreen';
import { RandomItemTable } from '../models/RandomItemTable';
import { RandomItemTablesChunk } from '../models/RandomItemTablesChunk';
import { RandomUnitTable } from '../models/RandomUnitTable';
import { RandomUnitTableRow } from '../models/RandomUnitTableRow';
import { RandomUnitTablesChunk } from '../models/RandomUnitTablesChunk';
import { Tech } from '../models/Tech';
import { TechsChunk } from '../models/TechsChunk';
import { UnknownV0ToV3 } from '../models/UnknownV0ToV3';
import { UnknownV4ToV8 } from '../models/UnknownV4ToV8';
import { Upgrade } from '../models/Upgrade';
import { UpgradesChunk } from '../models/UpgradesChunk';
import { W3W3i } from '../models/W3W3i';
import { W3char } from '../models/W3char';
import { W3id } from '../models/W3id';
import { W3str } from '../models/W3str';
import { WaterColor } from '../models/WaterColor';

import { DooControllerApiRequestFactory, DooControllerApiResponseProcessor} from "../apis/DooControllerApi";
export class ObservableDooControllerApi {
    private requestFactory: DooControllerApiRequestFactory;
    private responseProcessor: DooControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DooControllerApiRequestFactory,
        responseProcessor?: DooControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DooControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DooControllerApiResponseProcessor();
    }

    /**
     */
    public convert11(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert11(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert11(rsp)));
            }));
    }

}

import { DooUnitsControllerApiRequestFactory, DooUnitsControllerApiResponseProcessor} from "../apis/DooUnitsControllerApi";
export class ObservableDooUnitsControllerApi {
    private requestFactory: DooUnitsControllerApiRequestFactory;
    private responseProcessor: DooUnitsControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DooUnitsControllerApiRequestFactory,
        responseProcessor?: DooUnitsControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DooUnitsControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DooUnitsControllerApiResponseProcessor();
    }

    /**
     */
    public convert12(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert12(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert12(rsp)));
            }));
    }

}

import { MmpControllerApiRequestFactory, MmpControllerApiResponseProcessor} from "../apis/MmpControllerApi";
export class ObservableMmpControllerApi {
    private requestFactory: MmpControllerApiRequestFactory;
    private responseProcessor: MmpControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MmpControllerApiRequestFactory,
        responseProcessor?: MmpControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MmpControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MmpControllerApiResponseProcessor();
    }

    /**
     */
    public convert10(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert10(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert10(rsp)));
            }));
    }

}

import { ShdControllerApiRequestFactory, ShdControllerApiResponseProcessor} from "../apis/ShdControllerApi";
export class ObservableShdControllerApi {
    private requestFactory: ShdControllerApiRequestFactory;
    private responseProcessor: ShdControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ShdControllerApiRequestFactory,
        responseProcessor?: ShdControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ShdControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ShdControllerApiResponseProcessor();
    }

    /**
     */
    public convert9(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert9(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert9(rsp)));
            }));
    }

}

import { W3AControllerApiRequestFactory, W3AControllerApiResponseProcessor} from "../apis/W3AControllerApi";
export class ObservableW3AControllerApi {
    private requestFactory: W3AControllerApiRequestFactory;
    private responseProcessor: W3AControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: W3AControllerApiRequestFactory,
        responseProcessor?: W3AControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new W3AControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new W3AControllerApiResponseProcessor();
    }

    /**
     */
    public convert8(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert8(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert8(rsp)));
            }));
    }

}

import { W3CControllerApiRequestFactory, W3CControllerApiResponseProcessor} from "../apis/W3CControllerApi";
export class ObservableW3CControllerApi {
    private requestFactory: W3CControllerApiRequestFactory;
    private responseProcessor: W3CControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: W3CControllerApiRequestFactory,
        responseProcessor?: W3CControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new W3CControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new W3CControllerApiResponseProcessor();
    }

    /**
     */
    public convert7(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert7(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert7(rsp)));
            }));
    }

}

import { W3EControllerApiRequestFactory, W3EControllerApiResponseProcessor} from "../apis/W3EControllerApi";
export class ObservableW3EControllerApi {
    private requestFactory: W3EControllerApiRequestFactory;
    private responseProcessor: W3EControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: W3EControllerApiRequestFactory,
        responseProcessor?: W3EControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new W3EControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new W3EControllerApiResponseProcessor();
    }

    /**
     */
    public convert6(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert6(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert6(rsp)));
            }));
    }

}

import { W3IControllerApiRequestFactory, W3IControllerApiResponseProcessor} from "../apis/W3IControllerApi";
export class ObservableW3IControllerApi {
    private requestFactory: W3IControllerApiRequestFactory;
    private responseProcessor: W3IControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: W3IControllerApiRequestFactory,
        responseProcessor?: W3IControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new W3IControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new W3IControllerApiResponseProcessor();
    }

    /**
     */
    public convert5(_options?: Configuration): Observable<W3W3i> {
        const requestContextPromise = this.requestFactory.convert5(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert5(rsp)));
            }));
    }

}

import { W3RControllerApiRequestFactory, W3RControllerApiResponseProcessor} from "../apis/W3RControllerApi";
export class ObservableW3RControllerApi {
    private requestFactory: W3RControllerApiRequestFactory;
    private responseProcessor: W3RControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: W3RControllerApiRequestFactory,
        responseProcessor?: W3RControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new W3RControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new W3RControllerApiResponseProcessor();
    }

    /**
     */
    public convert4(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert4(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert4(rsp)));
            }));
    }

}

import { W3SControllerApiRequestFactory, W3SControllerApiResponseProcessor} from "../apis/W3SControllerApi";
export class ObservableW3SControllerApi {
    private requestFactory: W3SControllerApiRequestFactory;
    private responseProcessor: W3SControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: W3SControllerApiRequestFactory,
        responseProcessor?: W3SControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new W3SControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new W3SControllerApiResponseProcessor();
    }

    /**
     */
    public convert3(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert3(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert3(rsp)));
            }));
    }

}

import { W3VControllerApiRequestFactory, W3VControllerApiResponseProcessor} from "../apis/W3VControllerApi";
export class ObservableW3VControllerApi {
    private requestFactory: W3VControllerApiRequestFactory;
    private responseProcessor: W3VControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: W3VControllerApiRequestFactory,
        responseProcessor?: W3VControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new W3VControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new W3VControllerApiResponseProcessor();
    }

    /**
     */
    public convert2(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert2(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert2(rsp)));
            }));
    }

}

import { WctControllerApiRequestFactory, WctControllerApiResponseProcessor} from "../apis/WctControllerApi";
export class ObservableWctControllerApi {
    private requestFactory: WctControllerApiRequestFactory;
    private responseProcessor: WctControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WctControllerApiRequestFactory,
        responseProcessor?: WctControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WctControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WctControllerApiResponseProcessor();
    }

    /**
     */
    public convert1(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert1(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert1(rsp)));
            }));
    }

}

import { WpmControllerApiRequestFactory, WpmControllerApiResponseProcessor} from "../apis/WpmControllerApi";
export class ObservableWpmControllerApi {
    private requestFactory: WpmControllerApiRequestFactory;
    private responseProcessor: WpmControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WpmControllerApiRequestFactory,
        responseProcessor?: WpmControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WpmControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WpmControllerApiResponseProcessor();
    }

    /**
     */
    public convert(_options?: Configuration): Observable<string> {
        const requestContextPromise = this.requestFactory.convert(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.convert(rsp)));
            }));
    }

}
