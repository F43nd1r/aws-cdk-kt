package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunchTemplate(
  id: String,
  props: CfnLaunchTemplateProps,
  initializer: @AwsCdkDsl CfnLaunchTemplate.() -> Unit = {},
): CfnLaunchTemplate = CfnLaunchTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLaunchTemplate(id: String, initializer: @AwsCdkDsl
    CfnLaunchTemplate.Builder.() -> Unit = {}): CfnLaunchTemplate =
    CfnLaunchTemplate.Builder.create(this, id).apply(initializer).build()
