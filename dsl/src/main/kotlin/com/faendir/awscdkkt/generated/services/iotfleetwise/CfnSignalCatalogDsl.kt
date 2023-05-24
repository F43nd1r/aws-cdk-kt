package com.faendir.awscdkkt.generated.services.iotfleetwise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSignalCatalog(id: String, props: CfnSignalCatalogProps): CfnSignalCatalog =
    CfnSignalCatalog(this, id, props)

@Generated
public fun Construct.cfnSignalCatalog(
  id: String,
  props: CfnSignalCatalogProps,
  initializer: @AwsCdkDsl CfnSignalCatalog.() -> Unit,
): CfnSignalCatalog = CfnSignalCatalog(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnSignalCatalog(id: String): CfnSignalCatalog = CfnSignalCatalog(this, id)

@Generated
public fun Construct.cfnSignalCatalog(id: String, initializer: @AwsCdkDsl
    CfnSignalCatalog.() -> Unit): CfnSignalCatalog = CfnSignalCatalog(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnSignalCatalog(id: String, initializer: @AwsCdkDsl
    CfnSignalCatalog.Builder.() -> Unit): CfnSignalCatalog = CfnSignalCatalog.Builder.create(this,
    id).apply(initializer).build()
