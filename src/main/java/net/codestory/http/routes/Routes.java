/**
 * Copyright (C) 2013 all@code-story.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package net.codestory.http.routes;

import net.codestory.http.*;
import net.codestory.http.filters.*;
import net.codestory.http.injection.*;

public interface Routes {
  Routes setIocAdapter(IocAdapter iocAdapter);

  Routes include(Class<? extends Configuration> configurationClass);

  Routes include(Configuration configuration);

  Routes filter(Class<? extends Filter> filterClass);

  Routes filter(Filter filter);

  Routes add(Class<?> resource);

  Routes add(String urlPrefix, Class<?> resource);

  Routes add(Object resource);

  Routes add(String urlPrefix, Object resource);

  Routes get(String uriPattern, Object payload);

  Routes get(String uriPattern, NoParamRoute route);

  Routes get(String uriPattern, NoParamRouteWithContext route);

  Routes get(String uriPattern, OneParamRouteWithContext route);

  Routes get(String uriPattern, TwoParamsRouteWithContext route);

  Routes get(String uriPattern, ThreeParamsRouteWithContext route);

  Routes get(String uriPattern, FourParamsRouteWithContext route);

  Routes post(String uriPattern, NoParamRoute route);

  Routes post(String uriPattern, NoParamRouteWithContext route);

  Routes post(String uriPattern, OneParamRouteWithContext route);

  Routes post(String uriPattern, TwoParamsRouteWithContext route);

  Routes post(String uriPattern, ThreeParamsRouteWithContext route);

  Routes post(String uriPattern, FourParamsRouteWithContext route);

  Routes put(String uriPattern, NoParamRoute route);

  Routes put(String uriPattern, NoParamRouteWithContext route);

  Routes put(String uriPattern, OneParamRouteWithContext route);

  Routes put(String uriPattern, TwoParamsRouteWithContext route);

  Routes put(String uriPattern, ThreeParamsRouteWithContext route);

  Routes put(String uriPattern, FourParamsRouteWithContext route);

  Routes delete(String uriPattern, NoParamRoute route);

  Routes delete(String uriPattern, NoParamRouteWithContext route);

  Routes delete(String uriPattern, OneParamRouteWithContext route);

  Routes delete(String uriPattern, TwoParamsRouteWithContext route);

  Routes delete(String uriPattern, ThreeParamsRouteWithContext route);

  Routes delete(String uriPattern, FourParamsRouteWithContext route);

  Routes catchAll(Object payload);

  Routes catchAll(NoParamRoute route);

  Routes catchAll(NoParamRouteWithContext route);

  RoutesWithPattern with(String uriPattern);
}
