package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceAccessControlAttributeConfiguration(
  id: String,
  props: CfnInstanceAccessControlAttributeConfigurationProps,
  initializer: CfnInstanceAccessControlAttributeConfiguration.() -> Unit = {},
): CfnInstanceAccessControlAttributeConfiguration =
    CfnInstanceAccessControlAttributeConfiguration(this, id, props).apply(initializer)
