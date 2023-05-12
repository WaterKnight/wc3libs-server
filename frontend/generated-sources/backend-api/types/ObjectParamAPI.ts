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

import { ObservableDooControllerApi } from "./ObservableAPI";
import { DooControllerApiRequestFactory, DooControllerApiResponseProcessor} from "../apis/DooControllerApi";

export interface DooControllerApiConvert11Request {
}

export class ObjectDooControllerApi {
    private api: ObservableDooControllerApi

    public constructor(configuration: Configuration, requestFactory?: DooControllerApiRequestFactory, responseProcessor?: DooControllerApiResponseProcessor) {
        this.api = new ObservableDooControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert11(param: DooControllerApiConvert11Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert11( options).toPromise();
    }

}

import { ObservableDooUnitsControllerApi } from "./ObservableAPI";
import { DooUnitsControllerApiRequestFactory, DooUnitsControllerApiResponseProcessor} from "../apis/DooUnitsControllerApi";

export interface DooUnitsControllerApiConvert12Request {
}

export class ObjectDooUnitsControllerApi {
    private api: ObservableDooUnitsControllerApi

    public constructor(configuration: Configuration, requestFactory?: DooUnitsControllerApiRequestFactory, responseProcessor?: DooUnitsControllerApiResponseProcessor) {
        this.api = new ObservableDooUnitsControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert12(param: DooUnitsControllerApiConvert12Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert12( options).toPromise();
    }

}

import { ObservableMmpControllerApi } from "./ObservableAPI";
import { MmpControllerApiRequestFactory, MmpControllerApiResponseProcessor} from "../apis/MmpControllerApi";

export interface MmpControllerApiConvert10Request {
}

export class ObjectMmpControllerApi {
    private api: ObservableMmpControllerApi

    public constructor(configuration: Configuration, requestFactory?: MmpControllerApiRequestFactory, responseProcessor?: MmpControllerApiResponseProcessor) {
        this.api = new ObservableMmpControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert10(param: MmpControllerApiConvert10Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert10( options).toPromise();
    }

}

import { ObservableShdControllerApi } from "./ObservableAPI";
import { ShdControllerApiRequestFactory, ShdControllerApiResponseProcessor} from "../apis/ShdControllerApi";

export interface ShdControllerApiConvert9Request {
}

export class ObjectShdControllerApi {
    private api: ObservableShdControllerApi

    public constructor(configuration: Configuration, requestFactory?: ShdControllerApiRequestFactory, responseProcessor?: ShdControllerApiResponseProcessor) {
        this.api = new ObservableShdControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert9(param: ShdControllerApiConvert9Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert9( options).toPromise();
    }

}

import { ObservableW3AControllerApi } from "./ObservableAPI";
import { W3AControllerApiRequestFactory, W3AControllerApiResponseProcessor} from "../apis/W3AControllerApi";

export interface W3AControllerApiConvert8Request {
}

export class ObjectW3AControllerApi {
    private api: ObservableW3AControllerApi

    public constructor(configuration: Configuration, requestFactory?: W3AControllerApiRequestFactory, responseProcessor?: W3AControllerApiResponseProcessor) {
        this.api = new ObservableW3AControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert8(param: W3AControllerApiConvert8Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert8( options).toPromise();
    }

}

import { ObservableW3CControllerApi } from "./ObservableAPI";
import { W3CControllerApiRequestFactory, W3CControllerApiResponseProcessor} from "../apis/W3CControllerApi";

export interface W3CControllerApiConvert7Request {
}

export class ObjectW3CControllerApi {
    private api: ObservableW3CControllerApi

    public constructor(configuration: Configuration, requestFactory?: W3CControllerApiRequestFactory, responseProcessor?: W3CControllerApiResponseProcessor) {
        this.api = new ObservableW3CControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert7(param: W3CControllerApiConvert7Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert7( options).toPromise();
    }

}

import { ObservableW3EControllerApi } from "./ObservableAPI";
import { W3EControllerApiRequestFactory, W3EControllerApiResponseProcessor} from "../apis/W3EControllerApi";

export interface W3EControllerApiConvert6Request {
}

export class ObjectW3EControllerApi {
    private api: ObservableW3EControllerApi

    public constructor(configuration: Configuration, requestFactory?: W3EControllerApiRequestFactory, responseProcessor?: W3EControllerApiResponseProcessor) {
        this.api = new ObservableW3EControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert6(param: W3EControllerApiConvert6Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert6( options).toPromise();
    }

}

import { ObservableW3IControllerApi } from "./ObservableAPI";
import { W3IControllerApiRequestFactory, W3IControllerApiResponseProcessor} from "../apis/W3IControllerApi";

export interface W3IControllerApiConvert5Request {
}

export class ObjectW3IControllerApi {
    private api: ObservableW3IControllerApi

    public constructor(configuration: Configuration, requestFactory?: W3IControllerApiRequestFactory, responseProcessor?: W3IControllerApiResponseProcessor) {
        this.api = new ObservableW3IControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert5(param: W3IControllerApiConvert5Request = {}, options?: Configuration): Promise<W3W3i> {
        return this.api.convert5( options).toPromise();
    }

}

import { ObservableW3RControllerApi } from "./ObservableAPI";
import { W3RControllerApiRequestFactory, W3RControllerApiResponseProcessor} from "../apis/W3RControllerApi";

export interface W3RControllerApiConvert4Request {
}

export class ObjectW3RControllerApi {
    private api: ObservableW3RControllerApi

    public constructor(configuration: Configuration, requestFactory?: W3RControllerApiRequestFactory, responseProcessor?: W3RControllerApiResponseProcessor) {
        this.api = new ObservableW3RControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert4(param: W3RControllerApiConvert4Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert4( options).toPromise();
    }

}

import { ObservableW3SControllerApi } from "./ObservableAPI";
import { W3SControllerApiRequestFactory, W3SControllerApiResponseProcessor} from "../apis/W3SControllerApi";

export interface W3SControllerApiConvert3Request {
}

export class ObjectW3SControllerApi {
    private api: ObservableW3SControllerApi

    public constructor(configuration: Configuration, requestFactory?: W3SControllerApiRequestFactory, responseProcessor?: W3SControllerApiResponseProcessor) {
        this.api = new ObservableW3SControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert3(param: W3SControllerApiConvert3Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert3( options).toPromise();
    }

}

import { ObservableW3VControllerApi } from "./ObservableAPI";
import { W3VControllerApiRequestFactory, W3VControllerApiResponseProcessor} from "../apis/W3VControllerApi";

export interface W3VControllerApiConvert2Request {
}

export class ObjectW3VControllerApi {
    private api: ObservableW3VControllerApi

    public constructor(configuration: Configuration, requestFactory?: W3VControllerApiRequestFactory, responseProcessor?: W3VControllerApiResponseProcessor) {
        this.api = new ObservableW3VControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert2(param: W3VControllerApiConvert2Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert2( options).toPromise();
    }

}

import { ObservableWctControllerApi } from "./ObservableAPI";
import { WctControllerApiRequestFactory, WctControllerApiResponseProcessor} from "../apis/WctControllerApi";

export interface WctControllerApiConvert1Request {
}

export class ObjectWctControllerApi {
    private api: ObservableWctControllerApi

    public constructor(configuration: Configuration, requestFactory?: WctControllerApiRequestFactory, responseProcessor?: WctControllerApiResponseProcessor) {
        this.api = new ObservableWctControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert1(param: WctControllerApiConvert1Request = {}, options?: Configuration): Promise<string> {
        return this.api.convert1( options).toPromise();
    }

}

import { ObservableWpmControllerApi } from "./ObservableAPI";
import { WpmControllerApiRequestFactory, WpmControllerApiResponseProcessor} from "../apis/WpmControllerApi";

export interface WpmControllerApiConvertRequest {
}

export class ObjectWpmControllerApi {
    private api: ObservableWpmControllerApi

    public constructor(configuration: Configuration, requestFactory?: WpmControllerApiRequestFactory, responseProcessor?: WpmControllerApiResponseProcessor) {
        this.api = new ObservableWpmControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public convert(param: WpmControllerApiConvertRequest = {}, options?: Configuration): Promise<string> {
        return this.api.convert( options).toPromise();
    }

}
