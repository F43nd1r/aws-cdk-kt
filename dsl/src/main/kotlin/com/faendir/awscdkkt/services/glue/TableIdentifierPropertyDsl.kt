package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTable

@Generated
public fun tableIdentifierProperty(initializer: CfnTable.TableIdentifierProperty.Builder.() -> Unit
    = {}): CfnTable.TableIdentifierProperty =
    CfnTable.TableIdentifierProperty.builder().apply(initializer).build()
