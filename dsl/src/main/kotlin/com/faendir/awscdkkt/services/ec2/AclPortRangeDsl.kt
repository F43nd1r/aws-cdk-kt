package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AclPortRange

@Generated
public fun aclPortRange(initializer: AclPortRange.Builder.() -> Unit = {}): AclPortRange =
    AclPortRange.builder().apply(initializer).build()
