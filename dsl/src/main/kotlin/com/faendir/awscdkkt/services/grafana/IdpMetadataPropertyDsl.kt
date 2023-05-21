package com.faendir.awscdkkt.services.grafana

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

@Generated
public fun idpMetadataProperty(initializer: CfnWorkspace.IdpMetadataProperty.Builder.() -> Unit =
    {}): CfnWorkspace.IdpMetadataProperty =
    CfnWorkspace.IdpMetadataProperty.builder().apply(initializer).build()
