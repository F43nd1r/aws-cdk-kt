package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.Variable

@Generated
public fun buildVariable(initializer: @AwsCdkDsl Variable.Builder.() -> Unit = {}): Variable =
    Variable.Builder.create().apply(initializer).build()
