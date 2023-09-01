package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.ShellStep

@Generated
public fun buildShellStep(id: String, initializer: @AwsCdkDsl ShellStep.Builder.() -> Unit = {}):
    ShellStep = ShellStep.Builder.create(id).apply(initializer).build()
