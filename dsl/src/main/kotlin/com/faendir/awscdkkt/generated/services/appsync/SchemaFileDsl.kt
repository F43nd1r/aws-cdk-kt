package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.SchemaFile
import software.amazon.awscdk.services.appsync.SchemaProps

@Generated
public fun schemaFile(options: SchemaProps): SchemaFile = SchemaFile(options)

@Generated
public fun buildSchemaFile(initializer: @AwsCdkDsl SchemaFile.Builder.() -> Unit): SchemaFile =
    SchemaFile.Builder.create().apply(initializer).build()
