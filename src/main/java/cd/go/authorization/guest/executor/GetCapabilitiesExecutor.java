/*
 * Copyright 2019 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cd.go.authorization.guest.executor;

import cd.go.authorization.guest.model.Capabilities;
import cd.go.authorization.guest.model.SupportedAuthType;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import static com.thoughtworks.go.plugin.api.response.DefaultGoApiResponse.SUCCESS_RESPONSE_CODE;

public class GetCapabilitiesExecutor {

    public GoPluginApiResponse execute() {
        Capabilities capabilities = getCapabilities();
        return new DefaultGoPluginApiResponse(SUCCESS_RESPONSE_CODE, capabilities.toJSON());
    }

    Capabilities getCapabilities() {
        return new Capabilities(SupportedAuthType.Web, false, false, false);
    }
}
