package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationProfile(
  id: String,
  props: CfnConfigurationProfileProps,
  initializer: @AwsCdkDsl CfnConfigurationProfile.() -> Unit = {},
): CfnConfigurationProfile = CfnConfigurationProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationProfile(id: String, initializer: @AwsCdkDsl CfnConfigurationProfile.Builder.() -> Unit = {}): CfnConfigurationProfile = CfnConfigurationProfile.Builder.create(this, id).apply(initializer).build()
