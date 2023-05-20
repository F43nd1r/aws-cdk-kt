@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
