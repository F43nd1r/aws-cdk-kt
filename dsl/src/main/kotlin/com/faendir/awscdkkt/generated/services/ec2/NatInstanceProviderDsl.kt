package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NatInstanceProps
import software.amazon.awscdk.services.ec2.NatInstanceProvider

@Generated
public fun natInstanceProvider(props: NatInstanceProps): NatInstanceProvider =
    NatInstanceProvider(props)

@Generated
public fun buildNatInstanceProvider(initializer: @AwsCdkDsl NatInstanceProvider.Builder.() -> Unit):
    NatInstanceProvider = NatInstanceProvider.Builder.create().apply(initializer).build()
