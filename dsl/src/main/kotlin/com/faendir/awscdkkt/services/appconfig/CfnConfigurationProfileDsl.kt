@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
import software.constructs.Construct

public fun Construct.cfnConfigurationProfile(
  id: String,
  props: CfnConfigurationProfileProps,
  initializer: CfnConfigurationProfile.() -> Unit = {},
): CfnConfigurationProfile = CfnConfigurationProfile(this, id, props).apply(initializer)
