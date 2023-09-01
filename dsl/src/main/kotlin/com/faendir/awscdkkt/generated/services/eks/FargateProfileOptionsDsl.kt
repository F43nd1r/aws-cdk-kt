package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateProfileOptions

@Generated
public fun buildFargateProfileOptions(initializer: @AwsCdkDsl
    FargateProfileOptions.Builder.() -> Unit = {}): FargateProfileOptions =
    FargateProfileOptions.Builder().apply(initializer).build()
