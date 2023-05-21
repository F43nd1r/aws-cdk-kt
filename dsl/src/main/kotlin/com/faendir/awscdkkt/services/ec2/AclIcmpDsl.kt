package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AclIcmp

@Generated
public fun aclIcmp(initializer: AclIcmp.Builder.() -> Unit = {}): AclIcmp =
    AclIcmp.builder().apply(initializer).build()
