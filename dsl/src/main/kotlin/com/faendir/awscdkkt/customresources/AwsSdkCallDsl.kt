package com.faendir.awscdkkt.customresources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.customresources.AwsSdkCall

@Generated
public fun awsSdkCall(initializer: AwsSdkCall.Builder.() -> Unit = {}): AwsSdkCall =
    AwsSdkCall.builder().apply(initializer).build()
