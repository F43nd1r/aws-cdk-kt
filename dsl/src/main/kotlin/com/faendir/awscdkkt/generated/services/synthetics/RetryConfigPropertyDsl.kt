package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

@Generated
public fun buildRetryConfigProperty(initializer: @AwsCdkDsl
    CfnCanary.RetryConfigProperty.Builder.() -> Unit = {}): CfnCanary.RetryConfigProperty =
    CfnCanary.RetryConfigProperty.Builder().apply(initializer).build()
