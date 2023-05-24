package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps

@Generated
public fun launchTemplateRequireImdsv2Aspect(): LaunchTemplateRequireImdsv2Aspect =
    LaunchTemplateRequireImdsv2Aspect()

@Generated
public fun launchTemplateRequireImdsv2Aspect(props: LaunchTemplateRequireImdsv2AspectProps):
    LaunchTemplateRequireImdsv2Aspect = LaunchTemplateRequireImdsv2Aspect(props)

@Generated
public fun buildLaunchTemplateRequireImdsv2Aspect(initializer: @AwsCdkDsl
    LaunchTemplateRequireImdsv2Aspect.Builder.() -> Unit): LaunchTemplateRequireImdsv2Aspect =
    LaunchTemplateRequireImdsv2Aspect.Builder.create().apply(initializer).build()
