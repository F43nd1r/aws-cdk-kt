package com.faendir.awscdkkt.generated.services.route53.targets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.globalaccelerator.IAccelerator
import software.amazon.awscdk.services.route53.targets.GlobalAcceleratorTarget

@Generated
public fun globalAcceleratorTarget(accelerator: IAccelerator): GlobalAcceleratorTarget =
    GlobalAcceleratorTarget(accelerator)
