package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

@Generated
public fun buildRunConfigProperty(initializer: @AwsCdkDsl
    CfnCanary.RunConfigProperty.Builder.() -> Unit = {}): CfnCanary.RunConfigProperty =
    CfnCanary.RunConfigProperty.Builder().apply(initializer).build()
