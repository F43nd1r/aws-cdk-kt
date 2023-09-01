package com.faendir.awscdkkt.generated.services.sso

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnInstanceAccessControlAttributeConfiguration.() -> Unit = {},
): CfnInstanceAccessControlAttributeConfiguration =
    CfnInstanceAccessControlAttributeConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstanceAccessControlAttributeConfiguration(id: String,
    initializer: @AwsCdkDsl CfnInstanceAccessControlAttributeConfiguration.Builder.() -> Unit = {}):
    CfnInstanceAccessControlAttributeConfiguration =
    CfnInstanceAccessControlAttributeConfiguration.Builder.create(this,
    id).apply(initializer).build()
