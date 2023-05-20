@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.customresources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.customresources.AwsSdkCall

public fun awsSdkCall(initializer: AwsSdkCall.Builder.() -> Unit): AwsSdkCall =
    AwsSdkCall.builder().apply(initializer).build()
