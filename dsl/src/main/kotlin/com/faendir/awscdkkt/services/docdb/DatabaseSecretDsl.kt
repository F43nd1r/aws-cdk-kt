@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseSecret
import software.amazon.awscdk.services.docdb.DatabaseSecretProps
import software.constructs.Construct

public fun Construct.databaseSecret(
  id: String,
  props: DatabaseSecretProps,
  initializer: DatabaseSecret.() -> Unit = {},
): DatabaseSecret = DatabaseSecret(this, id, props).apply(initializer)
