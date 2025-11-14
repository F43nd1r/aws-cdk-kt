package com.faendir.awscdkkt.generated.interfaces.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.dynamodb.TableReference

@Generated
public fun buildTableReference(initializer: @AwsCdkDsl TableReference.Builder.() -> Unit = {}): TableReference = TableReference.Builder().apply(initializer).build()
