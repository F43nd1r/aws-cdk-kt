package com.faendir.awscdkkt.generated.services.docdb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseInstance
import software.amazon.awscdk.services.docdb.DatabaseInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.databaseInstance(
  id: String,
  props: DatabaseInstanceProps,
  initializer: @AwsCdkDsl DatabaseInstance.() -> Unit = {},
): DatabaseInstance = DatabaseInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseInstance(id: String, initializer: @AwsCdkDsl
    DatabaseInstance.Builder.() -> Unit = {}): DatabaseInstance =
    DatabaseInstance.Builder.create(this, id).apply(initializer).build()
