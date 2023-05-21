package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ShellStepProps

@Generated
public fun shellStepProps(initializer: ShellStepProps.Builder.() -> Unit = {}): ShellStepProps =
    ShellStepProps.builder().apply(initializer).build()
