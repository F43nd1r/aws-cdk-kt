package com.faendir.awscdkkt.generated.interfaces.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.s3tables.TableReference

@Generated
public fun buildTableReference(initializer: @AwsCdkDsl TableReference.Builder.() -> Unit = {}): TableReference = TableReference.Builder().apply(initializer).build()
