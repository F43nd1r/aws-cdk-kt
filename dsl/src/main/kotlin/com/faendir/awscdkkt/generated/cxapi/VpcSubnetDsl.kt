@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.cxapi.VpcSubnet

@Deprecated(message = "software.amazon.awscdk.cxapi.VpcSubnet is deprecated in CDK.")
@Generated
public fun buildVpcSubnet(initializer: @AwsCdkDsl VpcSubnet.Builder.() -> Unit = {}): VpcSubnet = VpcSubnet.Builder().apply(initializer).build()
