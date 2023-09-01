package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AclTrafficConfig

@Generated
public fun buildAclTrafficConfig(initializer: @AwsCdkDsl AclTrafficConfig.Builder.() -> Unit = {}):
    AclTrafficConfig = AclTrafficConfig.Builder().apply(initializer).build()
