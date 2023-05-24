package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableAttributes

@Generated
public fun buildTableAttributes(initializer: @AwsCdkDsl TableAttributes.Builder.() -> Unit):
    TableAttributes = TableAttributes.Builder().apply(initializer).build()
