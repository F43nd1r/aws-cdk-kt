package com.faendir.awscdkkt.generated.interfaces.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.s3tables.TableBucketReference

@Generated
public fun buildTableBucketReference(initializer: @AwsCdkDsl TableBucketReference.Builder.() -> Unit = {}): TableBucketReference = TableBucketReference.Builder().apply(initializer).build()
