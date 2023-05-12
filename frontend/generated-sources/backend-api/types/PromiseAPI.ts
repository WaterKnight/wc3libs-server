import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

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
import { ObservableDooControllerApi } from './ObservableAPI';

import { DooControllerApiRequestFactory, DooControllerApiResponseProcessor} from "../apis/DooControllerApi";
export class PromiseDooControllerApi {
    private api: ObservableDooControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DooControllerApiRequestFactory,
        responseProcessor?: DooControllerApiResponseProcessor
    ) {
        this.api = new ObservableDooControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert11(_options?: Configuration): Promise<string> {
        const result = this.api.convert11(_options);
        return result.toPromise();
    }


}



import { ObservableDooUnitsControllerApi } from './ObservableAPI';

import { DooUnitsControllerApiRequestFactory, DooUnitsControllerApiResponseProcessor} from "../apis/DooUnitsControllerApi";
export class PromiseDooUnitsControllerApi {
    private api: ObservableDooUnitsControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DooUnitsControllerApiRequestFactory,
        responseProcessor?: DooUnitsControllerApiResponseProcessor
    ) {
        this.api = new ObservableDooUnitsControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert12(_options?: Configuration): Promise<string> {
        const result = this.api.convert12(_options);
        return result.toPromise();
    }


}



import { ObservableMmpControllerApi } from './ObservableAPI';

import { MmpControllerApiRequestFactory, MmpControllerApiResponseProcessor} from "../apis/MmpControllerApi";
export class PromiseMmpControllerApi {
    private api: ObservableMmpControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MmpControllerApiRequestFactory,
        responseProcessor?: MmpControllerApiResponseProcessor
    ) {
        this.api = new ObservableMmpControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert10(_options?: Configuration): Promise<string> {
        const result = this.api.convert10(_options);
        return result.toPromise();
    }


}



import { ObservableShdControllerApi } from './ObservableAPI';

import { ShdControllerApiRequestFactory, ShdControllerApiResponseProcessor} from "../apis/ShdControllerApi";
export class PromiseShdControllerApi {
    private api: ObservableShdControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ShdControllerApiRequestFactory,
        responseProcessor?: ShdControllerApiResponseProcessor
    ) {
        this.api = new ObservableShdControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert9(_options?: Configuration): Promise<string> {
        const result = this.api.convert9(_options);
        return result.toPromise();
    }


}



import { ObservableW3AControllerApi } from './ObservableAPI';

import { W3AControllerApiRequestFactory, W3AControllerApiResponseProcessor} from "../apis/W3AControllerApi";
export class PromiseW3AControllerApi {
    private api: ObservableW3AControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: W3AControllerApiRequestFactory,
        responseProcessor?: W3AControllerApiResponseProcessor
    ) {
        this.api = new ObservableW3AControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert8(_options?: Configuration): Promise<string> {
        const result = this.api.convert8(_options);
        return result.toPromise();
    }


}



import { ObservableW3CControllerApi } from './ObservableAPI';

import { W3CControllerApiRequestFactory, W3CControllerApiResponseProcessor} from "../apis/W3CControllerApi";
export class PromiseW3CControllerApi {
    private api: ObservableW3CControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: W3CControllerApiRequestFactory,
        responseProcessor?: W3CControllerApiResponseProcessor
    ) {
        this.api = new ObservableW3CControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert7(_options?: Configuration): Promise<string> {
        const result = this.api.convert7(_options);
        return result.toPromise();
    }


}



import { ObservableW3EControllerApi } from './ObservableAPI';

import { W3EControllerApiRequestFactory, W3EControllerApiResponseProcessor} from "../apis/W3EControllerApi";
export class PromiseW3EControllerApi {
    private api: ObservableW3EControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: W3EControllerApiRequestFactory,
        responseProcessor?: W3EControllerApiResponseProcessor
    ) {
        this.api = new ObservableW3EControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert6(_options?: Configuration): Promise<string> {
        const result = this.api.convert6(_options);
        return result.toPromise();
    }


}



import { ObservableW3IControllerApi } from './ObservableAPI';

import { W3IControllerApiRequestFactory, W3IControllerApiResponseProcessor} from "../apis/W3IControllerApi";
export class PromiseW3IControllerApi {
    private api: ObservableW3IControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: W3IControllerApiRequestFactory,
        responseProcessor?: W3IControllerApiResponseProcessor
    ) {
        this.api = new ObservableW3IControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert5(_options?: Configuration): Promise<W3W3i> {
        const result = this.api.convert5(_options);
        return result.toPromise();
    }


}



import { ObservableW3RControllerApi } from './ObservableAPI';

import { W3RControllerApiRequestFactory, W3RControllerApiResponseProcessor} from "../apis/W3RControllerApi";
export class PromiseW3RControllerApi {
    private api: ObservableW3RControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: W3RControllerApiRequestFactory,
        responseProcessor?: W3RControllerApiResponseProcessor
    ) {
        this.api = new ObservableW3RControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert4(_options?: Configuration): Promise<string> {
        const result = this.api.convert4(_options);
        return result.toPromise();
    }


}



import { ObservableW3SControllerApi } from './ObservableAPI';

import { W3SControllerApiRequestFactory, W3SControllerApiResponseProcessor} from "../apis/W3SControllerApi";
export class PromiseW3SControllerApi {
    private api: ObservableW3SControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: W3SControllerApiRequestFactory,
        responseProcessor?: W3SControllerApiResponseProcessor
    ) {
        this.api = new ObservableW3SControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert3(_options?: Configuration): Promise<string> {
        const result = this.api.convert3(_options);
        return result.toPromise();
    }


}



import { ObservableW3VControllerApi } from './ObservableAPI';

import { W3VControllerApiRequestFactory, W3VControllerApiResponseProcessor} from "../apis/W3VControllerApi";
export class PromiseW3VControllerApi {
    private api: ObservableW3VControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: W3VControllerApiRequestFactory,
        responseProcessor?: W3VControllerApiResponseProcessor
    ) {
        this.api = new ObservableW3VControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert2(_options?: Configuration): Promise<string> {
        const result = this.api.convert2(_options);
        return result.toPromise();
    }


}



import { ObservableWctControllerApi } from './ObservableAPI';

import { WctControllerApiRequestFactory, WctControllerApiResponseProcessor} from "../apis/WctControllerApi";
export class PromiseWctControllerApi {
    private api: ObservableWctControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WctControllerApiRequestFactory,
        responseProcessor?: WctControllerApiResponseProcessor
    ) {
        this.api = new ObservableWctControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert1(_options?: Configuration): Promise<string> {
        const result = this.api.convert1(_options);
        return result.toPromise();
    }


}



import { ObservableWpmControllerApi } from './ObservableAPI';

import { WpmControllerApiRequestFactory, WpmControllerApiResponseProcessor} from "../apis/WpmControllerApi";
export class PromiseWpmControllerApi {
    private api: ObservableWpmControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WpmControllerApiRequestFactory,
        responseProcessor?: WpmControllerApiResponseProcessor
    ) {
        this.api = new ObservableWpmControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     */
    public convert(_options?: Configuration): Promise<string> {
        const result = this.api.convert(_options);
        return result.toPromise();
    }


}



