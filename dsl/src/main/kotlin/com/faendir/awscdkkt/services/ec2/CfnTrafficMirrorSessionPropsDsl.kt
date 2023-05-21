package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps

@Generated
public fun cfnTrafficMirrorSessionProps(initializer: CfnTrafficMirrorSessionProps.Builder.() -> Unit
    = {}): CfnTrafficMirrorSessionProps =
    CfnTrafficMirrorSessionProps.builder().apply(initializer).build()
