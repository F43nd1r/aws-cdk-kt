package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.RedshiftQuery

@Generated
public fun buildRedshiftQuery(clusterArn: String, initializer: @AwsCdkDsl RedshiftQuery.Builder.() -> Unit = {}): RedshiftQuery = RedshiftQuery.Builder.create(clusterArn).apply(initializer).build()
