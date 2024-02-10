package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.ResultWriter

@Generated
public fun buildResultWriter(initializer: @AwsCdkDsl ResultWriter.Builder.() -> Unit = {}):
    ResultWriter = ResultWriter.Builder.create().apply(initializer).build()
