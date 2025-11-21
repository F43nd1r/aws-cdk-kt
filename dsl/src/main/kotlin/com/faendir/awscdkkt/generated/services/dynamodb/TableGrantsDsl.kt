package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableGrants

@Generated
public fun buildTableGrants(initializer: @AwsCdkDsl TableGrants.Builder.() -> Unit = {}): TableGrants = TableGrants.Builder.create().apply(initializer).build()
