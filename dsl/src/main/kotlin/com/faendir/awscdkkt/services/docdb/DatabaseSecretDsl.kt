@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
