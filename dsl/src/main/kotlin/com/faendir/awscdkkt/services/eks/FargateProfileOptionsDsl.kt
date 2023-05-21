package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateProfileOptions

@Generated
public fun fargateProfileOptions(initializer: FargateProfileOptions.Builder.() -> Unit = {}):
    FargateProfileOptions = FargateProfileOptions.builder().apply(initializer).build()
