package com.faendir.awscdkkt.generated.services.elasticbeanstalk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationTemplate(
  id: String,
  props: CfnConfigurationTemplateProps,
  initializer: @AwsCdkDsl CfnConfigurationTemplate.() -> Unit = {},
): CfnConfigurationTemplate = CfnConfigurationTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationTemplate(id: String, initializer: @AwsCdkDsl
    CfnConfigurationTemplate.Builder.() -> Unit = {}): CfnConfigurationTemplate =
    CfnConfigurationTemplate.Builder.create(this, id).apply(initializer).build()
