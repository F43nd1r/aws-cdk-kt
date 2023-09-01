package com.faendir.awscdkkt.generated.services.location

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.amazon.awscdk.services.location.CfnGeofenceCollectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGeofenceCollection(
  id: String,
  props: CfnGeofenceCollectionProps,
  initializer: @AwsCdkDsl CfnGeofenceCollection.() -> Unit = {},
): CfnGeofenceCollection = CfnGeofenceCollection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGeofenceCollection(id: String, initializer: @AwsCdkDsl
    CfnGeofenceCollection.Builder.() -> Unit = {}): CfnGeofenceCollection =
    CfnGeofenceCollection.Builder.create(this, id).apply(initializer).build()
