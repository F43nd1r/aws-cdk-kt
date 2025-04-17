package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.WriterConfig

@Generated
public fun buildWriterConfig(initializer: @AwsCdkDsl WriterConfig.Builder.() -> Unit = {}):
    WriterConfig = WriterConfig.Builder.create().apply(initializer).build()
