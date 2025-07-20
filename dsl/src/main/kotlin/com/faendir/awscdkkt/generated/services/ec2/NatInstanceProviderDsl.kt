@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NatInstanceProvider

@Deprecated(message = "software.amazon.awscdk.services.ec2.NatInstanceProvider is deprecated in CDK.")
@Generated
public fun buildNatInstanceProvider(initializer: @AwsCdkDsl NatInstanceProvider.Builder.() -> Unit = {}): NatInstanceProvider = NatInstanceProvider.Builder.create().apply(initializer).build()
