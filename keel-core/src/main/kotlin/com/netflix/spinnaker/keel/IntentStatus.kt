/*
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.spinnaker.keel

/**
 * ACTIVE: An Intent is currently being enforced and will be regularly checked
 * for any state to converge on.
 *
 * SUPERSEDED: An Intent that is no longer active, as it was superseded by
 * a different Intent.
 *
 * CANCELED: An Intent that is no longer active because it has been canceled by
 * an operator or via a FailureModeController.
 *
 * TERMINAL: An Intent that is no longer active because it encountered an fatal
 * error.
 */
enum class IntentStatus {
  ACTIVE,
  SUPERSEDED,
  CANCELED,
  TERMINAL
}
