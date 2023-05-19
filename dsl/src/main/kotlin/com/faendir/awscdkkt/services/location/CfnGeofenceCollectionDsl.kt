@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.amazon.awscdk.services.location.CfnGeofenceCollectionProps
import software.constructs.Construct

public fun Construct.cfnGeofenceCollection(
  id: String,
  props: CfnGeofenceCollectionProps,
  initializer: CfnGeofenceCollection.() -> Unit = {},
): CfnGeofenceCollection = CfnGeofenceCollection(this, id, props).apply(initializer)
