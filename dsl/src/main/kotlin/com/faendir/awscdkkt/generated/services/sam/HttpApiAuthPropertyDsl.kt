package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public fun buildHttpApiAuthProperty(initializer: @AwsCdkDsl
    CfnHttpApi.HttpApiAuthProperty.Builder.() -> Unit = {}): CfnHttpApi.HttpApiAuthProperty =
    CfnHttpApi.HttpApiAuthProperty.Builder().apply(initializer).build()
