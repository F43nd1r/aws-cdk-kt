package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ECRSourceOptions

@Generated
public fun buildECRSourceOptions(initializer: @AwsCdkDsl ECRSourceOptions.Builder.() -> Unit = {}):
    ECRSourceOptions = ECRSourceOptions.Builder().apply(initializer).build()
