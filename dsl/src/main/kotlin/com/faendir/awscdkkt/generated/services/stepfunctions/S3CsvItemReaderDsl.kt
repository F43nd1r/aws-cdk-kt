package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.S3CsvItemReader

@Generated
public fun buildS3CsvItemReader(initializer: @AwsCdkDsl S3CsvItemReader.Builder.() -> Unit = {}):
    S3CsvItemReader = S3CsvItemReader.Builder.create().apply(initializer).build()
