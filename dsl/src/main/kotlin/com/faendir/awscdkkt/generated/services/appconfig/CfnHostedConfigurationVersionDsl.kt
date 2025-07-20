package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHostedConfigurationVersion(
  id: String,
  props: CfnHostedConfigurationVersionProps,
  initializer: @AwsCdkDsl CfnHostedConfigurationVersion.() -> Unit = {},
): CfnHostedConfigurationVersion = CfnHostedConfigurationVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHostedConfigurationVersion(id: String, initializer: @AwsCdkDsl CfnHostedConfigurationVersion.Builder.() -> Unit = {}): CfnHostedConfigurationVersion = CfnHostedConfigurationVersion.Builder.create(this, id).apply(initializer).build()
