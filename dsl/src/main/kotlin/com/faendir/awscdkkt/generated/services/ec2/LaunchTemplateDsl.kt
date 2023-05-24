package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplate
import software.amazon.awscdk.services.ec2.LaunchTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.launchTemplate(id: String): LaunchTemplate = LaunchTemplate(this, id)

@Generated
public fun Construct.launchTemplate(id: String, initializer: @AwsCdkDsl LaunchTemplate.() -> Unit):
    LaunchTemplate = LaunchTemplate(this, id).apply(initializer)

@Generated
public fun Construct.launchTemplate(id: String, props: LaunchTemplateProps): LaunchTemplate =
    LaunchTemplate(this, id, props)

@Generated
public fun Construct.launchTemplate(
  id: String,
  props: LaunchTemplateProps,
  initializer: @AwsCdkDsl LaunchTemplate.() -> Unit,
): LaunchTemplate = LaunchTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLaunchTemplate(id: String, initializer: @AwsCdkDsl
    LaunchTemplate.Builder.() -> Unit): LaunchTemplate = LaunchTemplate.Builder.create(this,
    id).apply(initializer).build()
