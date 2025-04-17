@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.ResultWriter

@Deprecated(message =
    "software.amazon.awscdk.services.stepfunctions.ResultWriter is deprecated in CDK.")
@Generated
public fun buildResultWriter(initializer: @AwsCdkDsl ResultWriter.Builder.() -> Unit = {}):
    ResultWriter = ResultWriter.Builder.create().apply(initializer).build()
