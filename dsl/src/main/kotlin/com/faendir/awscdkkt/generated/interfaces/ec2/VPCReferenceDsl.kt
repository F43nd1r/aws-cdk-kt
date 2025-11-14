package com.faendir.awscdkkt.generated.interfaces.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.ec2.VPCReference

@Generated
public fun buildVPCReference(initializer: @AwsCdkDsl VPCReference.Builder.() -> Unit = {}): VPCReference = VPCReference.Builder().apply(initializer).build()
