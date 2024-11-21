package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

@Generated
public fun buildNodeRepairConfigProperty(initializer: @AwsCdkDsl
    CfnNodegroup.NodeRepairConfigProperty.Builder.() -> Unit = {}):
    CfnNodegroup.NodeRepairConfigProperty =
    CfnNodegroup.NodeRepairConfigProperty.Builder().apply(initializer).build()
